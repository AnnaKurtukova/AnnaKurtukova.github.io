#include <ctype.h>
#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include <fstream>
#include <iostream>
#include <conio.h>
using namespace std;
const int mx=0,mf=1,size=50;
typedef struct _t 
	{int data[size]; int cur;} tes; // ��� ��-� �����
void init(tes* s)
	{for(int i=0;i<size;i++)s->data[i]=0; s->cur=-1;} // ������������� 
int empty(tes *s)
	{return s->cur==-1;} 
void push(tes *s,int i)
	{s->data[++(s->cur)]=i;} // ��������
int pop(tes*s)
	{return empty(s)?0:s->data[(s->cur)--];} // ��������
int main()
	{ ifstream input_file("1.txt"); //  ������� ����� �����

const int l=50; char e[l]; char buf[l]; tes s; init(&s); // ��������� ���������� � �������������� ����
input_file.getline(e,l,'\n'); // ����� ������ �� �����
int i,j,len=strlen(e); // ���������� ����� ��������� ������
for(i=0;i<len;i++){if(e[i]=='M')
	{push(&s,mx); continue;}
if(e[i]=='N')
	{push(&s,mf); continue;}
if(isdigit(e[i]))
	{j=0; 
while(isdigit(e[i])) buf[j++]=e[i++]; buf[j]=' '; push(&s,atoi(buf));} // ��������� � ���� ���� �������� � �����
	if(e[i]==')'){int b=pop(&s); int a=pop(&s); int func=pop(&s); if(func==mx)push(&s,a>b?a:b);
	else push(&s,a<b?a:b); // ���� ���������� ����������� ������, ����������� �� ����� ��� ����� � ��� ��������
}}
cout<<e;
cout<<endl;
cout<<pop(&s); //������� ������ ��������� ��������� � ���������
getch();
}
