#include <iostream>
#include <cstdlib>

using namespace std;

int main()
{
    system("chcp 1251");

	int i = 0;
	do
	{
		double num1, num2, rez;
		char op;

		cout << endl;
		cout << "\t������� ������ �����, �������� � ������ ����� ����� ������: ";
		cin >> num1 >> op >> num2;
		cout << endl;
		
		switch (op)
		{
		case '+': rez = num1 + num2;
			cout << "\t" << num1 << " " << op << " " << num2 << " = " << rez << endl;
			cout << endl;
			cout << "\t���� ������ ����������, ������� 1, ���� ���, ������� ����� ������ �����: ";
			cin >> i;
			break;
		case '-': rez = num1 - num2;
			cout << "\t" << num1 << " " << op << " " << num2 << " = " << rez << endl;
			cout << endl;
			cout << "\t���� ������ ����������, ������� 1, ���� ���, ������� ����� ������ �����: ";
			cin >> i;
			break;
		case '*': rez = num1 * num2;
			cout << "\t" << num1 << " " << op << " " << num2 << " = " << rez << endl;
			cout << endl;
			cout << "\t���� ������ ����������, ������� 1, ���� ���, ������� ����� ������ �����: ";
			cin >> i;
			break;
		case '/': rez = num1 / num2;
			cout << "\t" << num1 << " " << op << " " << num2 << " = " << rez << endl;
			cout << endl;
			cout << "\t���� ������ ����������, ������� 1, ���� ���, ������� ����� ������ �����: ";
			cin >> i;
			break;
		default: 
			cout << "\t�� ���������� ��������!" << endl;
			cout << endl;
			cout << "\t���� ������ ����������, ������� 1, ���� ���, ������� ����� ������ �����: ";
			cin >> i;
		}

	} while (i == 1);

	cout << endl;
	cout << "\t����!" << endl;

    return 0;
}