import os
import pandas as pd
from IPython.display import display
from scipy.stats import zscore

df = pd.read_csv("https://data.heatonresearch.com/data/t81-558/auto-mpg.csv", na_values=['NA', '?'])


# zscore function
df['mpg'] = zscore(df['mpg'])
display(df[0:5])