<?php
// Get the PHP helper library from https://twilio.com/docs/libraries/php
require_once '/path/to/vendor/autoload.php'; // Loads the library
use Twilio\Rest\Client;

// Your Account Sid and Auth Token from twilio.com/user/account
$sid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
$token = "your_auth_token";
$client = new Client($sid, $token);

$address = $client
    ->addresses("AD2a0747eba6abf96b7e3c3ff0b4530f6e");

// Loop over the list of numbers and echo a property for each one
foreach ($address->dependentPhoneNumbers->read() as $number) {
    echo $number->friendlyName;
}
