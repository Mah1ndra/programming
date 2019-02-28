#include <iostream>
using namespace std;

int main(){
    int t;
    long int n,m,x,y;
    cin >> t;
    while(t--){
        cin >> n >> m >> x >> y;
        
        if((n-1)%x==0&&(m-1)%y==0)){
        	cout << "Chefirnemo\n";
        }else{
        	if((n-1)%x-1==0&&(m-1)%y-1==0){
            cout << "Chefirnemo\n";
        }else{
            cout << "Pofik\n";
        }
        }
        
    }

    return 0;
}