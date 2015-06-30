[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/Prismarine/Prismarine?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)
# Prismarine
Prismarine is an implementation of our Minecraft server API, called PrismarineAPI. Prismarine enables developers to develop plugins in the popular scripting language Javascript, and we are planning to support languages such as Python, and ofcourse Java. Prismarine is focussing on creating a stable server mod with great performance, and easy plugin development. Prismarine's developers have been playing minecraft for years now, and have managed big minecraft servers, giving us an unique perspective of what an API should look like.

NOTE: THIS IS EXTREMELY UNSTABLE SOFTWARE, WITH CODE THAT IS HEAVILY IN DEVELOPMENT.

BECAUSE OF SCHOOL, I HAVE NOT HAD ENOUGH TIME TO WORK ON THIS PROJECT, SUMMER BREAK IN 2 WEEKS, WHERE I'll WORK ON THIS PROJECT.

## Plugins
Creating a plugin in prismarine is as easy as this:
```javascript
function onEnable() {
    Logger.write("Plugin test message");
}
function onDisable() {
    Logger.error("Uh oh, you disabled our lovely plugin");
}
```
And we are planning on creating a packet manager that enables you to add a plugin with 1 single command!

## Contributing
More information on contributing to the prismarine project will be available soon, for now you can just contact me via email at ```prismarine@nickforall.nl```, or on twitter ```@nickforall__```

NOTE: when using including nms code, please use Spigot's mappings for deobfuscation.

## Roadmap
* [ ] Buy domain prismarine.org
* [ ] setup IRC server
* [ ] setup prismarine forums

if you are able to help me with this, contact me via the email or twitter stated above.
