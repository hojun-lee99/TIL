n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.
maxS = 0

for i in range(n - 2):
    for j in range(m):
        sumV = grid[i][j] + grid[i + 1][j] + grid[i + 2][j]
        maxS = max(maxS, sumV)

for i in range(n):
    for j in range(m - 2):
        sumV = grid[i][j] + grid[i][j + 1] + grid[i][j + 2]
        maxS = max(maxS, sumV)

for i in range(n - 1):
    for j in range(m - 1):
        sumA = grid[i][j] + grid[i + 1][j + 1] + grid[i + 1][j]
        sumB = grid[i][j] + grid[i + 1][j + 1] + grid[i][j + 1]
        sumC = grid[i][j] + grid[i + 1][j] + grid[i][j + 1]
        sumD = grid[i + 1][j] + grid[i + 1][j + 1] + grid[i][j + 1]
        maxS = max(maxS, sumA, sumB, sumC, sumD)

print(maxS)
