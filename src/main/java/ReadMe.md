Virtual Pets AMOK

The class virtual pet allows for the creation of an organic cat, 
an organic dog, a robot dog, and a robot cat. Health, happiness, and boredom are 
traits that all virtual pets share. Happiness will go down if health gets too low. 
All pets start out with default stats. Tick method and play method are housed here.

The dog class contains the walk method which increases happiness.

The organic interface contains methods for feeding and giving water to all organic pets.

The robot interface contains the oil pet method.

The organic cat class contains new instance variables for hunger and thirst. Health is affected
when hunger and thirst levels are too low. Individual cat's can be played with.

The organic dog class extends the dog class and implements the organic interface and contains new instance variables for hunger, thirst, and amount of waste. 
Health is affected when hunger/thirst levels are too low and amount of waste is too high.
Clean cage method is introduced to reduce the amount of waste in a dogs cage. 
Walk method also reduces the amount of waste in a cage.

The robot dog class extends the dog class and implements the
robot interface which has method for oiling the pet 
and contains the new instance variable oil level. If oil level drops too low then health will be affected.
Walk method will increase happiness in robot dogs.

The robot cat class implements the robot interface and has a new instance variable for oil level.
If the oil level drops too low then health will be affected.

The virtual pet shelter class has methods for feeding all of the organic pets,
giving water to all of the organic pets, walking the dogs, cleaning the dogs cages,
cleaning the litterbox, adopting a pet, and admitting a pet.
Calling the feed all and water all methods will increase the amount of waste in a dogs cage 
and in a cat's litterbox. Here the tick all method is calling for all individual pet tick methods.
All virtual pets are stored in a map/collection.

The virtual pet shelter app will display a menu for options and display all of the virtual 
pet stats. When user admits a pet there will be a mini menu displayed so that proper 
constructor is used. 



 
