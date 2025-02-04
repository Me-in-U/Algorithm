import sys

# mis-decoded 문자열을 입력받음.
# (문제에서는 입력이 이미 windows-1252로 해석된 문자열이라고 가정)
# raw_input = sys.stdin.read().rstrip("\n")
raw_input = input()


def count_hangul(text):
    # 한글 음절 (AC00~D7A3)의 개수를 센다.
    return sum(1 for c in text if "\uac00" <= c <= "\ud7a3")


# 후보 인코딩 목록
encodings = ["EUC-KR", "IBM-Thai", "Shift_JIS", "UTF-8", "windows-1252"]

best_enc = None
best_score = -1

# 먼저 mis-decoded된 문자열을 windows-1252 인코딩 기준으로 bytes로 변환
try:
    data = raw_input.encode("windows-1252")
except Exception:
    data = raw_input.encode()  # 예외 발생시 기본 인코딩 사용

# 각 후보 인코딩으로 재해석
for enc in encodings:
    try:
        decoded = data.decode(enc, errors="strict")
        print(decoded)
    except Exception:
        continue
    # 한글 문자가 많으면 올바른 인코딩일 가능성이 높음.
    score = count_hangul(decoded)
    if score > best_score:
        best_score = score
        best_enc = enc

# 결과 출력
print(best_enc)
