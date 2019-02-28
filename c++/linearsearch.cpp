#include <iostream>
using namespace std;
int linearsearch(int values[],int target,int n){
    for(int i=0;i<n;i++){
        if(values[i]==target){
            return i;
        }
    }
return -1;
}

int main(){
    int n,t;
    cout << "enter size: "<<endl;
    cin >> n;
    int *values= (int *)malloc(n*sizeof(int));
    cout<<"enter elements into array"<<endl;
    for(int i=0;i<n;i++){
        cin >> values[i];
    }
    cout<<"enter target element: "<<endl;
    cin >> t;
    cout<< "found at index: "<< linearsearch(values,t,n);<<endl;
}