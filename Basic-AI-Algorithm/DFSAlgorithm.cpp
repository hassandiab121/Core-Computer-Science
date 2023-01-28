#include <iostream>
#include<queue>
#include<vector>

using namespace std;

int num_of_edges, from, to, goal, start;
vector<int> adj[150009], answer;
bool explored[150009], done;

void StateSpaceGraph()
{
    cout << "enter number of edges: ";
    cin >> num_of_edges;
    cout << "enter the edges: ";
    for (int i = 0; i < num_of_edges; i++)
    {
        cin >> from >> to;
        adj[from].push_back(to);
    }
}
void DFS(int node)
{
    if (explored[node] || done)
        return;
    if (node == goal)
    {
        explored[node] = true;
        done = true;
        answer.push_back(node); //Openlist 
        return;
    }

    answer.push_back(node);
    explored[node] = true;
    for (auto u : adj[node])
    {
        DFS(u);
    }
}

void Display(){
    cout << "the order of the nodes to reach the goal is: ";
    for (int i = 0; i < answer.size(); i++)
    {
        cout << answer[i] << " ";
    }
}
int main()
{
    StateSpaceGraph();
    cout << "Enter the goal: ";
    cin >> goal;
    cout << "Enter the starting node: ";
    cin >> start;
    DFS(start);
   Display();

    return 0;
}
