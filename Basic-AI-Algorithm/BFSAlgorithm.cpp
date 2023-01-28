#include <iostream>
#include<queue>
#include<vector>
using namespace std;


int Initialstate,goalstate,Numofedge,from,to,depth[1000009];
bool explored[1000009];
queue<int>Openlist;
vector<int>adj[1000009],Closedlist;


//create the state space graph
void StateSpaceGraph(){
    cout<<"enter number of edges: ";
    cin>>Numofedge;
    cout<<"enter the edges: ";
    for(int i=0;i<Numofedge;i++){
        cin>>from>>to;
        adj[from].push_back(to);
    }
}
// Breadth First Search Algorithm
void BFS(int start){
    explored[start]=true;
    depth[start]=0;
    Openlist.push(start);
    while(!Openlist.empty()){
        int currentstate=Openlist.front();
            Openlist.pop();  // frontier
        Closedlist.push_back(currentstate); // the route to goal 
        if(currentstate==goalstate){
            return;
        }

        for(auto state:adj[currentstate]){
            if(explored[state])
                continue;
            explored[state]=true;
            depth[state]=depth[currentstate]+1;
            Openlist.push(state);
        }
    }
    return;
}



void Display(){
    cout<<"the order of nodes we go through to achieve the goal node is: ";
    for(int i=0;i<Closedlist.size();i++)
        cout<<Closedlist[i]<<" ";
    cout<<"and the goal in the level: "<<depth[goalstate]<<endl;
}

int main()
{
    StateSpaceGraph();
	cout<<"enter the stating node(intial state): ";
    cin>>Initialstate;
    cout<<"enter the goal node: ";
    cin>>goalstate;
    BFS(Initialstate);
    Display();
    return 0;
}
