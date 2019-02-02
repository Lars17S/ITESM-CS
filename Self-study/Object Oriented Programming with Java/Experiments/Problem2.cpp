#include "iostream"
using namespace std;

int main() {
  //Variables declared, x input value, n iterator, d output value
  int x, n = 1;
  int d;
  //Ask for the input value
  cin >> x;
  //While the division is not an integer value, increment n and check again
  while(((2*x-n*(n+1)) % (2*(n+1)) != 0) && d < x) {
    ++n;
    d = (2*x-n*(n+1)) / (2*(n+1));
  }
  //Assign to d the integer value found
  if (2*x-n*(n+1)) % (2*(n+1)) != 0)
    cout << "Value not found" << endl;
  else
    cout << d << endl;
  //Output values
  return 0;
}
