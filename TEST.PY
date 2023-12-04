def build_lps(pattern):
    lps = [0] * len(pattern)
    length = 0
    # pattern의 첫 번째 문자는 항상 길이 0을 가짐
    i = 1
    while i < len(pattern):
        # 일치한다면
        if pattern[i] == pattern[length]:
            length += 1
            lps[i] = length
            i += 1
        else:
            if length != 0:
                # 이전 가장 긴 접두사로 이동
                length = lps[length - 1]
            else:
                lps[i] = 0
                i += 1
    return lps

def kmp_search(pat, txt):
    M = len(pat)
    N = len(txt)
    lps = build_lps(pat)
    # 인덱스 초기화:
    # i는 txt를 위한 인덱스, j는 pat를 위한 인덱스
    i, j = 0, 0  
    # 텍스트 전체를 순회
    while i < N:
        if pat[j] == txt[i]:
            i += 1
            j += 1
        # 패턴이 일치하는 경우
        if j == M:
            print(f"Found pattern at index {i - j}")
            # 다음 가능한 위치로 j를 업데이트
            j = lps[j - 1]
        # 패턴 불일치가 발생한 경우
        elif i < N and pat[j] != txt[i]:
            # 이전 위치에서의 lps값을 사용하여 j를 업데이트
            j = lps[j - 1] if j != 0 else 0
            # j가 0이면 텍스트의 다음 문자로 이동
            if j == 0:
                i += 1

# 테스트
txt = "ABABDABACDABABCABAB"
pat = "ABABCABAB"
kmp_search(pat, txt)