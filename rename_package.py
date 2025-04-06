import os


def update_package_declarations(root_dir):
    for dirpath, dirnames, filenames in os.walk(root_dir):
        for filename in filenames:
            if ".java" in filename:
                # 1) 파일 경로 및 package 이름 생성
                relative_path = os.path.relpath(dirpath, root_dir)
                package_name = f"{root_dir}.{relative_path.replace(os.sep, '.')}"
                file_path = os.path.join(dirpath, filename)

                # 2) 파일 전체 내용을 먼저 읽음 (read 모드)
                with open(file_path, "r", encoding="utf-8") as f:
                    lines = f.readlines()

                # 3) package 선언이 이미 있는지 검사하고, 있으면 대체/없으면 추가
                package_line_found = False
                new_lines = []
                for line in lines:
                    if line.strip().startswith("package "):
                        # 기존 package 줄을 새 package로 교체
                        new_lines.append(f"package {package_name};\n")
                        package_line_found = True
                    else:
                        new_lines.append(line)

                if not package_line_found:
                    # 기존 package 선언이 없다면 맨 위에 추가
                    new_lines.insert(0, f"package {package_name};\n")

                # 4) 다시 쓰기 (write 모드)
                with open(file_path, "w", encoding="utf-8") as f:
                    f.writelines(new_lines)


if __name__ == "__main__":
    roots = ["BAEKJOON", "CODEFORCE", "programmers", "SWEA"]
    for root in roots:
        update_package_declarations(root)
