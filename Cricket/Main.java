#include <bits/stdc++.h>
using namespace std;


int main()
{
    int total_ball;
    int total_runs;
    int runs_scored;
    int balls_bowled;


    double overs;
    double over_finished;
    double current_runrate;
    double Required_runrate;




    cin>>total_ball;
    cin>>total_runs;
    cin>>runs_scored;
    cin>>balls_bowled;


    double temp=0;
    overs=total_ball/6;
    temp=total_ball%6;
    overs=overs+temp/10.0; // total overs


    over_finished=balls_bowled/6;
    temp=balls_bowled%6;
    over_finished=(over_finished+temp/10.0); //over finished


    current_runrate=runs_scored/over_finished; //calculating current run rate


    Required_runrate=total_runs/overs; // calculating required run rate


    cout<<overs<<endl;
    cout<<over_finished<<endl;
    cout<<fixed<<setprecision(1)<<current_runrate<<endl;
    cout<<fixed<<setprecision(1)<<Required_runrate<<endl;


    if(current_runrate>=Required_runrate)
    {
        cout<<"Eligible to Win"<<endl;
    }
    else{
        cout<<"Not Eligible to Win"<<endl;
    }


    return 0;
}

