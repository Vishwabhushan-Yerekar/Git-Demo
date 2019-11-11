com.conformiq.creator.structure.v15
creator.gui.screen qmld8f711a5625745aead58be0d21a4aa4c "Home"
{
	creator.gui.form qml8d039cf87f4246bb81bef76d0f78acda "data"
	{
		creator.gui.textbox qmlca87007d2d31475d80809545fe9f081b "Name"
			type = String
			status = dontcare;
		creator.gui.textbox qmle4cb2abb141048f8818d2298f4dce068 "Email"
			type = String
			status = dontcare;
	}
}
creator.customaction qml408795b3879647bfad9c3325a628dfc4 "Sno"
	direction = in
	deleted
{
	creator.primitivefield qmle3ccf5de41e44d9c98153508bfc42adc "Sno"
		type = String
		deleted;
}
creator.customaction qmlcb81db04a09943d48e36b50d653a7a5e "Message"
	interfaces = [ qmld4d58d4398ec4b8a9568c2c348fe7564 ]
	shortform = "MS"
	direction = out
	tokens = [ reference qmla03ca8474d6d4c4ca9bf73e745966e51 ]
{
	creator.primitivefield qmla03ca8474d6d4c4ca9bf73e745966e51 "Message"
		type = String;
}
creator.externalinterface qmleeafb199c461448da1c3ee681085ad5e "Input"
	direction = in;
creator.externalinterface qmld4d58d4398ec4b8a9568c2c348fe7564 "Output"
	direction = out;
creator.customaction qml84b3767d463043689e4df1371d5e4e72 "Input"
	interfaces = [ qmleeafb199c461448da1c3ee681085ad5e ]
	shortform = "IP"
	direction = in
	tokens = [ reference qmlfa03c0c823934fb89919bfa52db50ade ]
{
	creator.primitivefield qmlfa03c0c823934fb89919bfa52db50ade "input"
		type = String;
}