#include<stdio.h>
int main()
{
  int n1,n2,n3,t;
  float avg;
  scanf("%d\n%d\n%d",&n1,&n2,&n3);
  t=n1+n2+n3;
  avg=t/3;
  printf("%f",avg);
  return 0;
}