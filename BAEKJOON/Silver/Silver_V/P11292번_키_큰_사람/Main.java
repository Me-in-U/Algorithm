package BAEKJOON.Silver.Silver_V.P11292번_키_큰_사람;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static class Student implements Comparable<Student> {
        String name;
        double height;

        public Student(String name, Double height) {
            this.name = name;
            this.height = height;
        }

        @Override
        public int compareTo(Student other) {
            return Double.compare(other.height, this.height);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = null;
        int n = -1;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            ArrayList<Student> students = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                input = br.readLine().split(" ");
                students.add(new Student(input[0], Double.parseDouble(input[1])));
            }
            Collections.sort(students);
            double maxHeight = students.get(0).height;
            for (Student student : students) {
                if (student.height == maxHeight) {
                    sb.append(student.name).append(' ');
                } else {
                    break;
                }
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}