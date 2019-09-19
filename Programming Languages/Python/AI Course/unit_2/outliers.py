import pandas as pd
import os
import numpy as np
from sklearn import metrics
from scipy.stats import zscore
from IPython.display import display

def remove_outliers(df, name, sd):
    # Name is the column that we're calculating the outliers
    # We are asking for a list of the values where the absolute value 
    # of each value and the mean is greater or equal than the amount of standard deviations above
    # sd times
    # sd is a constant factor
    # df[name] gets the column, df[name].mean() calculates average
    drop_rows = df.index[(np.abs(df[name] - df[name].mean()) >= (sd * df[name].std()))]
    # drop the rows, axis = 0 (rows) and axis = 1 (columns)
    # inplace means that it modifies the actual DataFrame and does not return a second DataFrame
    df.drop(drop_rows, axis = 0, inplace = True)

df = pd.read_csv("https://data.heatonresearch.com/data/t81-558/auto-mpg.csv", na_values=['NA', '?'])

# Outliers are values that are unusually high or low. Maybe two or three more desv values
# Create feature vector
med = df['horsepower'].median()
df['horsepower'] = df['horsepower'].fillna(med)

# Drop the name column. Dropping fields
# Some fields are of no values to the neural network and can be dropped
df.drop('name', 1, inplace = True)

# Drop outliers in horsepower
# {} is used to print new-style string with arguments. len get the number of rows
print("Length before MPG outliers dropped: {}".format(len(df)))
remove_outliers(df, 'mpg', 2) 
print("Length after MPG outliers dropped: {}".format(len(df)))
display(df[0:5])