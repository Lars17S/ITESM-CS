#include "iostream"
using namespace std;

long double factorial (long double num);

int main() {
  long double numFact;
  cout << "Input integer number: ";
  cin >> numFact;
  numFact = factorial(numFact);
  cout << numFact << endl;

  return 0;
}

long double factorial (long double num) { //n! = (n-1)! * n recursive factorial equation
  while (num != 1)
    return num * factorial(num - 1);
  return num;
}
