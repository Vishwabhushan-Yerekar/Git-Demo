com.conformiq.creator.structure.v15
creator.externalinterface qml893aa35303f041f1ac3aaeada5d4d9a0 "input"
	direction = in;
creator.externalinterface qml3882affb5ca5467bbdc820cfc23294cc "output"
	direction = out;
creator.customaction qml5dca2c3aa35a4966b842aefceabcabbc "Message"
	interfaces = [ qml3882affb5ca5467bbdc820cfc23294cc
qml893aa35303f041f1ac3aaeada5d4d9a0
	deleted ]
	shortform = "OP"
	direction = out
	tokens = [ reference qml808284eb0a7d4bcb9727317cf5ace6f7 ]
{
	creator.primitivefield qml808284eb0a7d4bcb9727317cf5ace6f7 "Message"
		type = String;
}
creator.customaction qml63a20e6dda2543a293a0f0c23d0e8c0f "Url"
	interfaces = [ qml893aa35303f041f1ac3aaeada5d4d9a0 ]
	shortform = "IP"
	direction = in
	tokens = [ reference qml92d7e8b952944549a7429cdc39aa30f8 ]
{
	creator.primitivefield qml92d7e8b952944549a7429cdc39aa30f8 "Url"
		type = String;
}
creator.gui.screen qml506f1236c03341b39a7b76f5a44b3623 "Home"
{
}