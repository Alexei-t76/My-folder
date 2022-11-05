#include <iostream>
using namespace std;

int main() {
	int a = 30;
	int* pa = &a;
	cout << *pa << endl;
	*pa = 10;
	cout << a << endl;

	
	double* pb = new double;
	*pb = 0.2;
	cout << *pb << endl;
	delete pb;
	
	int* pc = new int[10];
	int* pcopy = pc;
	int* pcopy2 = pc;
	for (int i = 0; i < 10; i++)
	{
		pc[i] = i;
		cout << pc[i] << " ";
		
	}
	
	cout << endl;
	cout << pcopy[2] << " " << pcopy[9] << endl;
	cout << endl;
	delete[] pcopy2;
	

	return 0;
}