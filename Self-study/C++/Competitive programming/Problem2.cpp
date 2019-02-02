#include "iostream"
#include "math.h"
using namespace std;
bool isInteger(double dvalue);

int main() {
  int num = 0, cases;
  double dvalue;
  cout << "INPUT\n" << "Write the number of cases: ";
  cin >> cases;

  int *sum = new int[cases];
  for (int i = 0; i < cases; ++i) {
    cout << "Insert X value: ";
    cin >> sum[i];
  }

  cout << "\nOUTPUT" << endl;
  for (int i = 0; i < cases; ++i) {
    num = 0;
    do {
    ++num;
    dvalue = (double(sum[i]) / (num + 1)) - (double(num) / 2);
    } while (isInteger(dvalue) == false && dvalue < sum[i]);
    if (isInteger(dvalue) == true && dvalue >= 1) //Test case 8
      cout << "Case[" << i + 1 << "] d value: " << dvalue << endl;
    else
      cout << "Case[" << i + 1 << "] d value: -1" << endl;
  }

  return 0;
}

bool isInteger(double dvalue)
{
    if(dvalue == floor(dvalue))
        return true;
    return false;
}
