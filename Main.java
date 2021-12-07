#Pings a user's GPS location and outputs the distance to the nearest Disneyland or Disneyworld location

import requests
import json
import urllib
import math

#Get user's current location
send_url = 'http://freegeoip.net/json'
r = requests.get(send_url)
j = json.loads(r.text)
lat = j['latitude']
lon = j['longitude']

#Get distance to Disneyland
disneyland_url = 'https://maps.googleapis.com/maps/api/distancematrix/json?origins=' + str(lat) + ',' + str(lon) + '&destinations=Disneyland&key=

#Output the distance to disneyland in a way that an iOS app widget can output it
print(urllib.urlopen(disneyland_url).read())