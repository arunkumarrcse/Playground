#include<stdio.h>
void main()
{
  float len,radius,angle;
  scanf("%f%f",&radius,&angle);
  len=2*3.14*radius*(angle/360);
  printf("%0.2f",len);
}
    
