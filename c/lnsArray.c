//largest and smallest numbers in an array
#include <stdio.h>
#define s 10
int main(){
    int n,i,j,a[s],l,sm;
    printf("Enter the number of elements into Array: \n");
    scanf("%d",&n);
    printf("\nEnter %d numbers into Array: \n",n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("Array: \n");
    for(i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    printf("\n");
    l=a[0];sm=a[0];
    for(i=0;i<n;i++){
       if(l<a[i]){
           l=a[i];
       }
       if(sm>a[i]){
           sm=a[i];
       }
    }
    printf("largest: %d\n Smallest: %d\n",l,sm);
    return 0;
}