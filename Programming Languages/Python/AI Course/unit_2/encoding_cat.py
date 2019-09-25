import os
import pandas as pd
from IPython.display import display
from scipy.stats import zscore

df = pd.read_csv("https://data.heatonresearch.com/data/t81-558/jh-simple-dataset.csv", na_values=['NA', '?'])

display(df[0:5])

areas = list(df['area'].unique())
print(f'Number of areas: {len(areas)}')
print(f'Areas: {areas}')

# One-hot-encoding
dummies = pd.get_dummies(['a', 'b', 'c', 'd'], prefix = 'area')
#print(dummies)

dummies = pd.get_dummies(df['area'], prefix = 'area')
#print(dummies[0:10])
df = pd.concat([df, dummies], axis = 1)
display(df[0:10][['id', 'job', 'area', 'income', 'area_a', 'area_b', 'area_c', 'area_d']])
df.drop('area', acis = 1, inplace = True)
