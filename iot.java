Components Required: Arduino UNO, Breadboard, Switch, 3LED, Jumper wires, 10k Register
int SwitchPin = 10;
int rPin=13;
int yPin=12;
int gPin=11;
boolean ledon = false;
void setup()
{
pinMode(SwitchPin, INPUT);
pinMode (rPin, OUTPUT);
pinMode (yPin, OUTPUT);
pinMode (gPin, OUTPUT);
}
void loop() {
if (digitalRead (SwitchPin) == HIGH)
{
digitalWrite (rPin, HIGH);
delay (5000);
digitalWrite (yPin, LOW);
delay (5000);
digitalWrite (gPin, LOW);
delay (5000);
}
else {
digitalWrite(rPin, HIGH);
delay(1000);
digitalWrite(rPin, LOW);
delay (1000);
if (digitalRead (SwitchPin) == HIGH)
{
digitalWrite(rPin, HIGH);
delay (5000);
digitalWrite (rPin, LOW);
}
digitalWrite(yPin, HIGH);
delay(1000);
digitalWrite(yPin, LOW );
delay(1000);
if (digitalRead (SwitchPin) == HIGH)
{
digitalWrite(rPin, HIGH);
delay(5000);
digitalWrite(yPin, LOW);
digitalWrite(yPin, HIGH);
delay(1000);
digitalWrite(yPin, LOW);
delay(1000);
}
digitalWrite(gPin, HIGH);
delay(1000);
digitalWrite(gPin, LOW);
delay(1000);
if(digitalRead (SwitchPin) == HIGH)
{
digitalWrite(rPin, HIGH);
delay(5000);
digitalWrite(rPin, LOW);
}
}
}
