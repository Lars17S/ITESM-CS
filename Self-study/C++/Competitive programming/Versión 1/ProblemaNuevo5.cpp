#include "iostream"
#include "vector"
using namespace std;
long long gcd(long long n, long long m);

int main() {
  long long sumN, sumK, input;
  vector <long long> valueN;
  vector <long long> valueK;

  do {
    cin >> input;
    valueN.push_back(input);
    cin >> input;
    valueK.push_back(input);
  } while(valueN.back() != -1 && valueK.back() != -1);
  cout << "askjqwke" << endl;

  for (int i = 0; i < (valueN.size() - 1); ++i) {
    sumN = ((valueN.at(i) - 1) * (valueN.at(i))) / 2; //Sum n(n+1)/2, but n = n - 1
    if(valueK.at(i) % 2 == 0)
      sumK = ((valueK.at(i))*(valueK.at(i)-2))/4;
    else
      sumK = ((valueK.at(i) - 1)/2)*((valueK.at(i) - 1)/2);
    cout << sumN;
    cout << sumK;
    cout << gcd(sumN, sumK);
    cout << sumK/gcd(sumN, sumK) << '/' << sumN/gcd(sumN, sumK);
  }
  return 0;
}

long long gcd(long long n, long long m) {
  if (m == 0)
    return n;
  else
    gcd(m, n%m);
  return 0;
}
