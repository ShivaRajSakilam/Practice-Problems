#include<iostream>
using namespace std;
int main()
{
    int i,j,N,p=1,a=0;
    cout<<"enter number";
    cin>>N;
    while(N!=0 || N!=1)
    {
            for(i=3;i<=N;i++)
            {
                    for(j=2;j<i;j++)
                    {
                        if(i%j==0)
                        break;
                        if(i%j!=0 && j==i-1)
                        p++;
                    }
        
            }
            N=N-p;
            p++;
            a++;
    }
    cout<<a;
    return 0;
}
