#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main(){
    vector<int> A = {11,2,9,4,1};//vector initialisation

    cout << A[1] << endl;//prints second element of A
    sort(A.begin(),A.end());//include algorithm
    //After sorting: 1,2,4,9,11
    bool present = binary_search(A.begin(),A.end(),9);//return bool type,include algorithm
    //inserting elements into vector
    A.push_back(100);
    A.push_back(100);
    A.push_back(100);
    A.push_back(100);
    A.push_back(123);
    //1,2,4,9,11,100,100,100,100,123
    //finding first occurance of 100
    vector<int>::iterator it1 = lower_bound(A.begin(),A.end(),100);//>= IN this case it gives index 5(100) . because at that index value is >= 100
    vector<int>::iterator it2 = upper_bound(A.begin(),A.end(),100);//>   in this case it gives index 9(123)  which is strictly greater than 100
    cout << *it1 << " " << *it2 << endl;//printing it1, it2cout 
    // To get count of that number simple do upper bound an lower bound and do difference of them
    cout << it2-it1 << endl;//4
    return 0;
}