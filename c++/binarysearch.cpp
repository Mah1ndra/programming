#include <iostream>
using namespace std;
int binarySearch(int array[],int t,int n){
    int h=n-1,l=0,m;
    while(h>=l){
        m=(h+l)/2;
        if(array[m]==t){
            return m;
        }else if(array[m]>t){
                h=m-1;
            }else{
                l=m+1;
            }
        
    }
    return -1;
}
int main() {
    int n,t;
    cin >> n;
	int *array = (int *)malloc(n*sizeof(int));
	for(int i=0;i<n;i++){
	    cin >> array[i];
	}
	cin >> t;
	cout << binarySearch(array,t,n)<<endl;
	return 0;
}
