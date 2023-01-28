#include <iostream>
#include<string>

using namespace std;

class Stack
{
 private:
        int top=-1;
        int data[10];
public:
     Stack(){}

void push(int index){
      if (top==10)
        cout << "Stack is Full\n";
      else
       data[++top]=index;
       
}


void print(){
     for(int counter=top ; counter>=0 ; counter--)
     {
      cout << data[counter]<<"\n";
     }
}
   

void pop(){
top--;
}
};

class Queue
{
  private :
      int rear=-1;
      int front=0;
      int size = 6;
      int queue[6];
      void resizing(int arr[], int newSize)
      {
         int newArr[newSize];
         int newRear = rear - front;
        size = newSize;
        for (int index = 0; front <= rear; index++)
        {
            newArr[index] = arr[front++];
        }
        front = 0;
        rear = newRear;
        arr = newArr;
        
      }

public: Queue(){}



void add(int num){

    if(size > 100)
        cout<<"\n"<<"Queue is Full";
           
    else
    {
        if (rear - front == (size -2) )
          resizing(queue, size+10);  
     queue[++rear]=num;
    
    }
    
}



void del(){
        if(front > rear)
          cout<<"\n"<<"Queue is empty";
        else
        {
             if (rear - front == (size / 4) )
                resizing(queue, size / 2);  
         front++;
    
        }
 
}



void print(){
        cout<<"\n";

    for(int i=front; i<=rear; i++)
       {
          cout<< to_string(queue[i]) + " ";
       }     
}
      
};


struct node{
        int data;
        node* next=NULL;
};

class LinkedList{

private:
struct node{
    int data;
    node* next=NULL;
};
node* head=NULL;  // first of the
node* last=NULL;  // last of the node

public:

void insertNode(int value){
    node* newNode = new node;
    newNode->data = value;

    if(head==NULL)
    {
        head=newNode;
        head->next=NULL;
    }
   if (head->next==NULL)  // code to add to the first node
    {
        last=newNode;
        head->next=last;
        newNode->next=NULL;
    }
    else     // to add to the latest node in linked list
    {
        last->next=newNode;
        last=newNode;
        newNode->next=NULL;
    }
}


void display(){

cout<<"\n";

node* current;
  current=head;
  while (true){
    cout <<current->data<<"\t";
    current=current->next;
    if(current==last)
    {
        cout <<current->data<<"\t";
        break;
    }

  }


}

void delet(int value){
    node* del=head;
    node* conect;
    node* remov;
    while(true)
    {
        if(del->data==value)
            {
            head=del->next;
            break;
            }

        else if(del->next->data == value && del->next!=last)
            {
                conect=del->next;
                 remov=conect;
                conect=conect->next;
                del->next=conect;
                cout<<"yes from middle";
                break;
            }
        else if(del->next==last && value == last->data)
            {
            remov=del->next;
            last=del;
            last->next=NULL;
            cout<<"yes from last";
             break;
            }
        else if (del->next==last && value != last->data)
            {
                break;
            }
            
        del=del->next;
    }

   free(remov);

}



void InsetAtBegining(int x){
  node* first_node=new node;
  first_node->data=x;
  first_node->next=head;
  head=first_node;

}

void InsetAtEnding(int x){
    node* end_node=new node;
    end_node->data=x;
    last->next=end_node;
    last=end_node;

}



void delete_after(int x){
   node *current=head;
   while(current->data != x)
   {
       current=current->next;
   }
   node *deleted=current->next;
   current->next=deleted->next;
   delete(deleted);
}

};

int main()
{
    Stack s1;
    Queue q1;
    LinkedList list ;


    return 0;
}


