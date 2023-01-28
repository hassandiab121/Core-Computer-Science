#include <iostream>
#include <stdlib.h>
using namespace std;

enum Status
{
	Clean,Dirty
};

enum Actions
{
	Nothing,MOVE_LEFT,MOVE_RIGHT,SUCK
};

enum Location
{
	A,B
};


class Environment
{
private :
	int size[3] ;


public:

	Environment()

	{
		SetEnvr();
	}

	void SetEnvr()
	{
	    cout<<"********** Envrmt setting ***********"<<endl;
		int ran = rand() % 10;
		if (ran < 5 )
			size [A] = Clean;
		else
			size [A] = Dirty;

		ran = rand() % 10;
		if (ran < 5 )
			size [B] = Clean;
		else
			size [B] = Dirty;



	}

	int GetStatus(int location)
	{
		return size[location];
	}

	void SetStatus(int location,int status )
	{
		size[location] = status;
	}

	void PrintStatus(int agentLoaction)
	{

		cout<<"==========Envrmt Status========="<<endl;
		if (GetStatus (A) == Dirty)
			cout<<"A status:"<<"Dirty" <<endl;
		else
			cout<<"A status:"<<"Clean" <<endl;

		if (GetStatus (B) == Dirty)
			cout<<"B status:"<<"Dirty" <<endl;
		else
			cout<<"B status:"<<"Clean" <<endl;

		if (agentLoaction == A)
			cout<<"agent location is: A"<<endl;
		else if(agentLoaction == B)
			cout<<"agent location is: B"<<endl;
        else
            cout<<"agent location is: C"<<endl;
		cout<<"================================"<<endl;
	}


};

class Agent
{
public :
	int ReflexiveVacuum(int location, int status)
	{
		if (status == Dirty)
			return SUCK;
		else if (location == A )
				return  MOVE_RIGHT;
		else
                return MOVE_LEFT;

	}
};

int main()
{
	Environment e ;
	Agent a;
	int currentLocation = A;

	for (int counter=0;counter<10;counter++)//while (true)
	{
		e.PrintStatus (currentLocation);

		if ( e.GetStatus (A) == Clean && e.GetStatus (B) == Clean)
			e.SetEnvr();

		int agentAction = a.ReflexiveVacuum ( currentLocation,e.GetStatus (currentLocation) );

		if ( agentAction == SUCK )
			e.SetStatus (currentLocation,Clean);
		else if ( agentAction == MOVE_RIGHT && currentLocation == A )
			currentLocation = B;

			currentLocation = A;
		//_sleep(500);

	}
}

