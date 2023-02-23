#include <iostream>
#include<string>
using namespace std;
/** This is  the implementation of the binary heaps Data Structure */

class BinaryHeaps
{
private:
    int *pq;
    int numOfNodes = 0;
    bool deleted = false ;
    void swim(int);
    void sink(int);
    bool less(int,int);
    void exch(int,int);
public:
    BinaryHeaps(int);
    void insert(int);
    int size();
    int min();
    void delMin();
    void display();
};

/*Definition of the constructor and class methods(member func) */
BinaryHeaps::BinaryHeaps(int size){
    pq = new int[size];
}

void BinaryHeaps::insert(int node){
     pq[++numOfNodes] = node;
    swim(numOfNodes); 
}

void BinaryHeaps::swim(int node){

    int localIndex = node;
    if (localIndex > 1){
        while (less(localIndex,localIndex / 2) && localIndex >= 2)
        {
            exch(localIndex, localIndex / 2);
            localIndex = localIndex / 2;
        }
        
    }
}

bool BinaryHeaps::less(int nodeIndex, int scndNodeIndex){
        return pq[nodeIndex] < pq[scndNodeIndex];    
}

void BinaryHeaps::exch(int n1, int n2){
int temp = pq[n1];
pq[n1] = pq[n2];
pq[n2] = temp;
}

int BinaryHeaps::min(){
    return pq[1];
}

int BinaryHeaps::size(){
  return numOfNodes;
}

void BinaryHeaps::delMin(){
    if (numOfNodes != 0)
    {
       exch(1,numOfNodes--);
       sink(1);
    }
}

void BinaryHeaps::sink(int nodeIndex){
    int temp = nodeIndex;
  if (numOfNodes > 1)
      {
        
        while (temp <= numOfNodes )
        {
            int l = temp*2;
            if (less(temp*2+1,temp*2))
            l = temp*2+1;
            if (!less(l ,temp) || l > numOfNodes)
            break;
            exch(temp,l);
            temp = temp*2;
        }
        
      }
}

void  BinaryHeaps::display(){
    cout<< "\n";
    for (int  i = 1; i <= numOfNodes; i++)
         cout<< to_string(pq[i]) + " "; 
}

int main()
{
    BinaryHeaps s = BinaryHeaps(15);
   
}
