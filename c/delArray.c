//Deleting an  element from an array
#include <stdio.h>
#define s 10
int main(){
    int n,i,a[s],pos;
    printf("Enter Number elments into Array: \n");
    scanf("%d",&n);
    printf("Enter %d numbers into array\n",n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("Enter the pos you want to delete: ");
    scanf("%d",&pos);
    printf("\nElements of Array before Deletion: \n");
    for(i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    printf("\n");
    for(i=pos-1;i<n-1;i++){
        a[i]=a[i+1];
    }
    printf("Elements of array after Deletion: \n");
    for(i=0;i<n-1;i++){
        printf("%d ",a[i]);
    }
    printf("\n");
    return 0;
}