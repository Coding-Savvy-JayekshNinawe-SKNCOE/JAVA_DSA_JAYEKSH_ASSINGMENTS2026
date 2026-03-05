#include<iostream>
using namespace std;

int main(){
    
    // int start = 1;
    // while (start<=100)
    // {
    //     cout<<start;
    //     start++;
    // }
    
    // for(; ; ){
    //     cout<<"start";
    // }
    


    return 0;
}


int main1(){
    //Print
    std::cout<<"Hello World"<<std::endl;
    std::cout<<"Hello Students"<<std::endl;

    // //input
    // int number;
    // std::cin>>number;
    // std::cout<<number;


    int marks = 20;
    char grade = 'A';
    float cgpa = 9.52;
    bool isPass = true;

    std::cout<<marks<<" " << grade<<" "<<cgpa<<" "<<isPass<<std::endl;

    return 0;
}

int main2(){
    int num1 = 10;
    int num2 = 20;

    //Addition
    int num3 = num1+num2; //30
    //Subratraction
    int num4 = num2-num1; //10
    //Multipliation
    int num5 = num1*num2; //200
    //division
    int num6 = num2/num1; // 2

    //Modulo Operator - Reminder

    int num7 = num2%num1; // 0

    int num8 = num2==num1; //0 - false
    int num9 = num2>num1;
    int num10 = num2<num1;

    int myNumber = 10;
    myNumber = myNumber+1;  ///11
    myNumber++; //increments your value by 1 - 12
    myNumber--; // Decrements your value by 1 . 11

    std::cout<<myNumber; //11

    std::cout<<"Hello";

    return 0;
}