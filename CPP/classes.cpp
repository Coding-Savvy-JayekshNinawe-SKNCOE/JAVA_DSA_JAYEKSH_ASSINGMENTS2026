#include<iostream>
using namespace std;

class Car{
    public:
    //Class Memebrs - Spefication
    string name;
    string color;
    int price;
    int topSpeed;

    //Method - Behaviour
    void drive(){
        cout<<"Car is driving"<<endl;
    }

    void brake(){
        cout<<"Car Brake Applied"<<endl;
    }
};


int main(){
    Car tata;

    //data members
    tata.name = "punch";
    tata.color = "black";
    tata.price = 600000;
    tata.topSpeed = 200;

    cout<<tata.name<<endl; //Punch


    tata.drive();

    tata.brake();

    




    return 0;
}