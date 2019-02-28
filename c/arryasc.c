//Array in ascending order
#include <stdio.h>

int main(){
    int n,i,j,temp,a[10];
    printf("Enter num of elements: ");
    scanf("%d",&n);
    printf("Entere the %d numbers into array: \n",n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("Elements before changing order: \n");
    for(i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    printf("\n");
    printf("Elements after Ascending order: \n");
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            if (a[i] > a[j]){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    for(i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    printf("\n");


    return 0;
}
