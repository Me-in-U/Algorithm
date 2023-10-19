import java.util.*;

public class Main {
  public static class Person {
    String name;
    String position;

    Person(String name, String position) {
      this.name = name;
      this.position = position;
    }

    public String getName() {
      return this.name;
    }
  }

  static int countCases(List<String>[] possiblePlayers, int pos, HashSet<String> used, String[] arrangement,
      Set<String> allCases) {
    if (pos == 5) {
      allCases.add(String.join(" ", arrangement));
      return 1;
    }

    int count = 0;
    for (String player : possiblePlayers[pos]) {
      if (!used.contains(player)) {
        used.add(player);
        arrangement[pos] = player;
        count += countCases(possiblePlayers, pos + 1, used, arrangement, allCases);
        used.remove(player);
      }
    }
    return count;
  }

  public static void main(String[] args) {
    List<Person>[] positionedPersons = new List[5];
    Map<String, Integer> posNum = new HashMap<>(6, 1);
    String[] positions = { "탑", "정글", "미드", "원딜", "서폿" };
    for (int i = 0; i < 5; i++) {
      positionedPersons[i] = new LinkedList<>();
      posNum.put(positions[i], i);
    }

    String[][] personsData = {
        { "김경록", "탑" },
        { "김민규", "미드 서폿" },
        { "김정민", "탑 정글 미드 원딜" },
        { "김준영", "탑 정글 미드" },
        { "구태균", "서폿 정글" },
        { "김현수", "원딜 미드 정글" },
        { "박건우", "원딜" },
        { "박태현", "정글 탑" },
        { "손성락", "탑 정글" },
        { "이진석", "미드 서폿" },
        { "정윤혁", "서폿" },
        { "황세원", "원딜" }
    };

    for (String[] namePos : personsData) {
      StringTokenizer st = new StringTokenizer(namePos[1]);
      while (st.hasMoreTokens()) {
        String position = st.nextToken();
        Person person = new Person(namePos[0], position);
        positionedPersons[posNum.get(position)].add(person);
      }
    }

    List<String>[] possiblePlayers = new ArrayList[5];
    for (int i = 0; i < 5; i++) {
      possiblePlayers[i] = new ArrayList<>();
      for (Person person : positionedPersons[i]) {
        possiblePlayers[i].add(person.getName());
      }
    }

    HashSet<String> allCases = new HashSet<>();
    HashSet<String> used = new HashSet<>();
    String[] arrangement = new String[5];
    int totalCount = countCases(possiblePlayers, 0, used, arrangement, allCases);

    // 랜덤하게 하나의 경우를 선택하여 출력
    String[] allCasesArray = allCases.toArray(new String[0]);
    Random rand = new Random();
    String randomCase = allCasesArray[rand.nextInt(allCasesArray.length)];
    System.out.println("탑     정글   미드   원딜   서폿");
    System.out.println(randomCase);
    System.out.println("경우의 수 " + totalCount + "개 중 1개");
  }
}
