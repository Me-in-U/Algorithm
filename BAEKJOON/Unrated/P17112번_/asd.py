import sys


def count_hangul(text):
    """문자열에서 한글(가-힣) 문자의 개수를 센다."""
    count = 0
    for c in text:
        if "\uAC00" <= c <= "\uD7A3":
            count += 1
    return count


# 후보 인코딩 5개
candidates = ["EUC-KR", "IBM-Thai", "Shift_JIS", "UTF-8", "windows-1252"]

# 하드코딩된 sample (소스 코드에 작성된 문자열)
sample = "ì˜ˆì œ ìž…ë ¥ë„ ì¸ì½”ë”©ë˜ì–´ ìžˆë‹¤. (ê·¸ëŸ° ì´ìœ ë¡œ ì˜ˆì œëŠ” ì±„ì ì„ í•˜ì§€ ì•ŠëŠ”ë‹¤.)"

# 터미널에서 입력받은 원시 바이트 읽기
input_bytes = sys.stdin.buffer.read()

# 만약 터미널 입력이 있으면 sample 대신 사용
if input_bytes:
    try:
        # 기본 디코딩은 UTF-8로 한다.
        sample = input_bytes.decode("utf-8")
    except Exception as e:
        # 디코딩 실패시 그냥 sample 그대로 사용
        pass

best_enc = ""
best_count = -1

# 각 후보 인코딩으로 sample 문자열을 인코딩 후 UTF-8로 디코딩한다.
for candidate in candidates:
    try:
        # sample 문자열을 각 후보 인코딩으로 변환 (즉, candidate 인코딩으로 "재인코딩")
        encoded = sample.encode(candidate)
        # 인코딩된 바이트를 UTF-8로 해석하여 문자열로 만든다.
        decoded = encoded.decode("utf-8")
        print(f"[{candidate}]: {decoded}")
        cnt = count_hangul(decoded)
        if cnt > best_count:
            best_count = cnt
            best_enc = candidate
    except Exception as e:
        print(f"[{candidate}]: 디코딩 에러 발생 ({e})")

print("최종 선택 인코딩:", best_enc)
print(best_enc)
