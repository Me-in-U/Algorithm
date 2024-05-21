# Modifying the existing code to fit the new problem requirements

MOD = 1000000007

# Modifying the isValidCombination function to include its own BFS logic for arrivalTime

def isValidCombination(combination, graph, N):
    # Performing BFS to check for collisions
    arrivalTime = {i: float('inf') for i in range(1, N+1)}
    arrivalTime[1] = 0
    queue = [1]
    
    while queue:
        current = queue.pop(0)
        for next_node in graph[current]:
            if arrivalTime[next_node] > arrivalTime[current] + 1:
                arrivalTime[next_node] = arrivalTime[current] + 1
                queue.append(next_node)
    
    for node in combination:
        for neighbor in graph[node]:
            if neighbor in combination and arrivalTime[node] == arrivalTime[neighbor]:
                return False  # Collision
    return True

# Re-testing the code with the modified function
def re_test_main():
    N, M = 3, 3
    graph = {i: [] for i in range(1, N+1)}
    
    roads = [(1, 2), (2, 3), (1, 3)]
    for a, b in roads:
        graph[a].append(b)
        graph[b].append(a)
    
    validCombinationsCount = 0
    
    for mask in range(1, 1 << N):
        combination = set()
        for j in range(N):
            if mask & (1 << j):
                combination.add(j + 1)
        
        if isValidCombination(combination, graph, N):
            validCombinationsCount = (validCombinationsCount + 1) % MOD
    
    return validCombinationsCount % MOD

re_test_main()
