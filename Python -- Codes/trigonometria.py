
from ipaddress import collapse_addresses


def hipotenusa(catO,catA):
    h = (catO**2 + catA**2)**0.5
    return h

def seno(catO,catA):
    h = hipotenusa(catO, catA)
    seno = catO/h
    return seno

def cosseno(catO,catA):
    h = hipotenusa(catO,catA)
    cosseno = catA/h
    return cosseno

def tangente(catO,catA):
    tan = seno(catO,catA)/cosseno(catO,catA)
    return tan