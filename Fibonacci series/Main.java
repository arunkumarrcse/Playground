#include<stdio.h>
int main()
{
 int n, i, f1=0,f2=1,nt;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    printf("%d ", f1) ;
    nt=f1+f2;
    f1=f2;
    f2=nt;
  } 
  return 0;
}