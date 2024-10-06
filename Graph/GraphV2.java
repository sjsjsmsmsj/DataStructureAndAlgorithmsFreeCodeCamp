// ADJACENCY LIST UNDIRECTED

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GraphV2 {
    LinkedList<Integer> adj[];
    private int V;
    private int E;
    
    public GraphV2(int nodes) {
        V = nodes;
        E = 0;
        this.adj = new LinkedList[nodes];
        for (int i = 0; i < nodes; i ++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        this.adj[u].add(v);
        this.adj[v].add(u);
        E ++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertex " + E + " edge\n");
        for (int i = 0; i < V; i ++) {
            sb.append(i + " : ");
            for (int w : adj[i]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public void bfs(int s) {
       boolean[] visited = new boolean[V];
        Queue<Integer> temp = new LinkedList<>();
        visited[s] = true;
        temp.offer(s);
        while (!temp.isEmpty()) {
            int u = temp.poll();
            System.out.print(u + " ");
            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    temp.offer(v);
                }
            }
        }
    }
    // dfs don't use recursive

    public void dfs(int s) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack();
        stack.push(s);
        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.print(u + " ");
                for (int x: adj[u]) {
                    if (!visited[x]) {
                        stack.push(x);
                    }
                }
            }
        }
    }
    public void dfs() {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i ++) {
            if (!visited[i]) {
                dfs(i, visited);
            }
        }
    }
    // dfs use recursive
    public void dfs(int i, boolean[] visited) {
        visited[i] = true;
        System.out.print(i + " ");
        for (int x : adj[i]) {
            if (!visited[x]) {
                dfs(x, visited);
            }
        }
    }
    public static int numsIsLands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    dfs(grid, i, j, visited);
                    count ++;
                }
            }
        }
        return count;
    }
    public static void dfs(char[][] grid, int row , int col, boolean[][] visited) {
        int m = grid.length;
        int n = grid[0].length;
        if (row < 0 || col < 0 || row >= m || col >= n || visited[row][col] || grid[row][col] == '0') {
            return ;
        }
        visited[row][col] = true;
        dfs(grid, row + 1, col, visited);
        dfs(grid, row - 1, col, visited);
        dfs(grid, row, col + 1, visited);
        dfs(grid, row, col - 1, visited);
    }
    public static void main(String[] args) {
        GraphV2 g = new GraphV2(16);
        Scanner sc = new Scanner(System.in);
        System.out.print("Input m: ");
        int m = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
    
        char[][] grid = new char[m][n];
        for (int i = 0; i < m; i++) {
            String row = sc.nextLine();
            for (int j = 0; j < n; j++) {
                grid[i][j] = row.charAt(j);
            }
        }
    
        int islands = GraphV2.numsIsLands(grid);
        System.out.println("Number of islands: " + islands);
    }
    

}
