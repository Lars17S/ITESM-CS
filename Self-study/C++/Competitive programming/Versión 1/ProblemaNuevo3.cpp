#include "iostream"
#include "vector"
using namespace std;
int gcd(int n, int m);


int main() {
  int input1, input2;
  vector<int> n, m;
  do {
    cout << "Write the value N: ";
    cin >> input1;
    n.push_back(input1);
    cout << "Write the value M: ";
    cin >> input2;
    m.push_back(input2);
  } while (input1 != -1 && input2 != -1);

  cout << endl;

  for (int i = 0; i < n.size(); ++i)
    cout << "Case[" << i + 1 << "]: " << gcd(n.at(i), m.at(i)) << endl;
  return 0;
}

int gcd(int n, int m) {
  if (m == 0)
    return n;
  else
    gcd(m, n%m);
}
