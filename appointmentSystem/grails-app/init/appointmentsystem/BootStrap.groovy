package com.sbrowne

class BootStrap {

	def init = { servletContext ->

	def objSurOne = new Surgery(
	name:'Sunny Pines',
	address:'Sunny Pines, 100 Pine Hill, Gottfried, London',
	postcode:'L1 7TY',
	telephone:'0337 877 1876',
	numberOfPatients:189,
	numberOfDoctors:15,
	description:'Sunny Pines is situated on scenic Pine Hill, Gottfried.',
	openingTime:'08:30am-17:30pm'
	).save()

	def objSurTwo = new Surgery(
	name:'Sheffield Hallam Surgery',
	address:'Sheffield Hallam University, Sheffield',
	postcode:'S1 6TY',
	telephone:'0114 876 5555',
	numberOfPatients:67,
	numberOfDoctors:2,
	description:'Sheffield Hallam University is the local insane asylum based in Sheffield.',
	openingTime:'12:00pm-13:00pm'
	).save()

	def objDocOne = new Doctor(
	fullName:'Dr Joseph Mengele',
	qualification:'MDmscMRI',
	position:'Chief Badboy',
	doctorEmail:'drdeath@gmail.com',
	password:'notanangel',
	doctorOffice:'G8756',
	doctorPhone:'075 765 4444',
	bio:'Dr Mengele is a senior chief badboy, watch out.',
	surgery:objSurOne
	).save()

	def objDocTwo = new Doctor(
	fullName:'Dr Ted Crilly',
	qualification:'MDPRIEST',
	position:'Rheumatologist',
	doctorEmail:'fatherted@gmail.com',
	password:'craggyisland',
	doctorOffice:'P7654',
	doctorPhone:'087 555 3333',
	bio:'Father Ted is a funny doctor he makes everyone laugh without drugs.',
	surgery:objSurOne
	).save()

	def objDocThree = new Doctor(
	fullName:'Dr Stephen Irwin',
	qualification:'MDmscMRI',
	position:'GP Surgeon',
	doctorEmail:'steve@gmail.com',
	password:'stevy89',
	doctorOffice:'G8779',
	doctorPhone:'075 765 3244',
	bio:'A local GP Surgeon',
	surgery:objSurTwo
	).save()

	def objDocFour = new Doctor(
	fullName:'Dr Barbosa Hector',
	qualification:'MSC Radiology',
	position:'Radiologist',
	doctorEmail:'radiostar@gmail.com',
	password:'MRI78',
	doctorOffice:'P7545',
	doctorPhone:'087 555 8933',
	bio:'Barbosa enjoys sailing the seven seas.',
	surgery:objSurTwo
	).save()

	def objRecOne = new Receptionist(
	recepName:'Mrs Theresa May',
	recepEmail:'crapPM@gmail.com',
	recepUsername:'Theresa1921',
	recepPassword:'brexitsucks',
	recepPhone:'0114 656 2222',
	surgery:objSurOne
	).save()

	def objRecTwo = new Receptionist(
	recepName:'Miss Jill Pill',
	recepEmail:'jillybean@gmail.com',
	recepUsername:'jillpill',
	recepPassword:'password',
	recepPhone:'0114 999 7777',
	surgery:objSurOne
	).save()

	def objRecThree = new Receptionist(
	recepName:'Mrs Radit Zanardi',
	recepEmail:'Zanardio@gmail.com',
	recepUsername:'zanardio89',
	recepPassword:'password',
	recepPhone:'0114 656 2782',
	surgery:objSurTwo
	).save()

	def objRecFour = new Receptionist(
	recepName:'Miss Jocelyn Foot',
	recepEmail:'J.Foot@gmail.com',
	recepUsername:'jfoot89',
	recepPassword:'password1',
	recepPhone:'0114 999 7567',
	surgery:objSurTwo
	).save()

	def objNurOne = new Nurse(
	nurseName:'Sister Sarah Succubus',
	qualifications:'Registered Nurse',
	nurseEmail:'twomulessistersarah@hotmail.com',
	nurseOffice:'Clinic 1',
	nursePhone:'098 764 5555',
	surgery:objSurOne
	).save()

	def objNurTwo = new Nurse(
	nurseName:'Matron Rachel Green',
	qualifications:'Registered Senior Nurse',
	nurseEmail:'friends@gmail.com',
	nurseOffice:'Clinic 68',
	nursePhone:'096 777 5555',
	surgery:objSurOne
	).save()

	def objNurThree = new Nurse(
	nurseName:'Petra Ivanovich',
	qualifications:'Registered Nurse',
	nurseEmail:'Petra@hotmail.com',
	nurseOffice:'Clinic 1',
	nursePhone:'098 764 4555',
	surgery:objSurTwo
	).save()

	def objNurFour = new Nurse(
	nurseName:'Alina Smirnova',
	qualifications:'Registered Senior Nurse',
	nurseEmail:'alina@gmail.com',
	nurseOffice:'Clinic 68',
	nursePhone:'096 777 5455',
	surgery:objSurTwo
	).save()



	def objPatOne = new Patient(
	patientName:'David Cameron',
	patientAddress:'120 Downies Street, Manchester, M1 78Y',
	patientResidence:'Rheumatology Dept',
	patientDob:new Date('01/01/1974'),
	patientID:'DC1234',
	dateRegistered:new Date('16/04/2015'),
	patientPhone:'+44114876203'
	).save()

	def objPatTwo = new Patient(
	patientName:'Micheal Myers',
	patientAddress:'25 Lefward Avenue, Coventry, CO1 7TY',
	patientResidence:'Ward 1',
	patientDob:new Date('18/08/1979'),
	patientID:'MM1879',
	dateRegistered:new Date('01/08/2014'),
	patientPhone:'0114 765 8765'
	).save()

	def objPatThree = new Patient(
	patientName:'Mr Ben Brode',
	patientAddress:'65 End Street, Sion Mills, BT82 9TY',
	patientResidence:'Radiology',
	patientDob:new Date('01/01/1977'),
	patientID:'BB6753',
	dateRegistered:new Date('16/04/2013'),
	patientPhone:'0761467633'
	).save()

	def objPatFour = new Patient(
	patientName:'Miss Julie Stanton',
	patientAddress:'67 Taytay Avenue, London, L1 7TY',
	patientResidence:'Ward 67',
	patientDob:new Date('18/08/1994'),
	patientID:'JS1879',
	dateRegistered:new Date('01/08/2009'),
	patientPhone:'0114 765 7645'
	).save()

	def objAppOne = new Appointment(
	appDate:new Date('09/09/2019'),
	appTime:'3:00pm',
	appDuration:45,
	roomNumber:'G9210',
	patient:objPatOne,
	doctor:objDocOne
	).save()

	def objAppTwo = new Appointment(
	appDate:new Date('10/09/2019'),
	appTime:'9:00am',
	appDuration:15,
	roomNumber:'P7823',
	patient:objPatTwo,
	doctor:objDocTwo
	).save()

	def objAppThree = new Appointment(
	appDate:new Date('11/09/2019'),
	appTime:'4:00pm',
	appDuration:30,
	roomNumber:'G9210',
	patient:objPatThree,
	doctor:objDocThree
	).save()

	def objAppFour = new Appointment(
	appDate:new Date('10/07/2019'),
	appTime:'9:30am',
	appDuration:60,
	roomNumber:'P7893',
	patient:objPatFour,
	doctor:objDocFour
	).save()

	def objPresOne = new Prescription(
	pharmacyName:'Boots Ltd',
	prescripNumber:2563,
	medicine:'Adderall',
	totalCost:8.60,
	dateIssued:new Date('11/01/2017'),
	patientPaying:false,
	doctor:objDocOne,
	patient:objPatOne
	).save()

	def objPresTwo = new Prescription(
	pharmacyName:'Boots Ltd',
	prescripNumber:23,
	medicine:'Naproxen',
	totalCost:1.51,
	dateIssued:new Date('02/12/1986'),
	patientPaying:false,
	patient:objPatOne
	).save()

	def objPresThree = new Prescription(
	pharmacyName:'Jacks Pharmacy',
	prescripNumber:1827,
	medicine:'Paracetamol',
	totalCost:2.60,
	dateIssued:new Date('11/01/2011'),
	patientPaying:true,
	patient:objPatTwo
	).save()

	def objPresFour = new Prescription(
	pharmacyName:'Jacks Pharmacy',
	prescripNumber:310,
	medicine:'Remicade',
	totalCost:100.51,
	dateIssued:new Date('02/12/1996'),
	patientPaying:true,
	patient:objPatTwo
	).save()

	def objPresFive = new Prescription(
	pharmacyName:'Suggs Chemist',
	prescripNumber:87235,
	medicine:'Ibuprofen',
	totalCost:2.90,
	dateIssued:new Date('11/01/2009'),
	patientPaying:false,
	patient:objPatThree
	).save()

	def objPresSix = new Prescription(
	pharmacyName:'Suggs Chemist',
	prescripNumber:9982,
	medicine:'Codiene Phosphate',
	totalCost:5.51,
	dateIssued:new Date('01/07/1998'),
	patientPaying:false,
	patient:objPatThree
	).save()

	def objPresSeven = new Prescription(
	pharmacyName:'Severns Pharmacy',
	prescripNumber:98162,
	medicine:'Paracetamol',
	totalCost:2.60,
	dateIssued:new Date('11/01/2011'),
	patientPaying:true,
	patient:objPatFour
	).save()

	def objPresEight = new Prescription(
	pharmacyName:'Severns Pharmacy',
	prescripNumber:555,
	medicine:'Humira',
	totalCost:900.80,
	dateIssued:new Date('02/12/2017'),
	patientPaying:true,
	patient:objPatFour
	).save()


	objSurOne.addToPatients(objPatOne)
	objSurOne.addToPatients(objPatTwo)
	objSurTwo.addToPatients(objPatThree)
	objSurTwo.addToPatients(objPatFour)
	
	objSurOne.addToAppointments(objAppOne)
	objSurOne.addToAppointments(objAppTwo)
	objSurTwo.addToAppointments(objAppThree)
	objSurTwo.addToAppointments(objAppFour)

	objNurOne.addToDoctors(objDocOne)
	objNurOne.addToDoctors(objDocTwo)
	objNurTwo.addToDoctors(objDocOne)
	objNurTwo.addToDoctors(objDocTwo)
	objNurThree.addToDoctors(objDocThree)
	objNurThree.addToDoctors(objDocFour)
	objNurFour.addToDoctors(objDocThree)
	objNurFour.addToDoctors(objDocFour)

	objAppOne.addToSurgeries(objSurOne)
	objAppTwo.addToSurgeries(objSurOne)
	objAppThree.addToSurgeries(objSurTwo)
	objAppFour.addToSurgeries(objSurOne)
	objAppFour.addToSurgeries(objSurTwo)

	objDocOne.addToPatients(objPatOne)
	objDocOne.addToPatients(objPatTwo)
	objDocTwo.addToPatients(objPatTwo)
	objDocTwo.addToPatients(objPatFour)
	objDocThree.addToPatients(objPatThree)
	objDocThree.addToPatients(objPatOne)
	objDocFour.addToPatients(objPatOne)
	objDocFour.addToPatients(objPatTwo)
	objDocFour.addToPatients(objPatThree)
	objDocFour.addToPatients(objPatFour)

	objDocOne.addToPrescriptions(objPresOne)
	objDocOne.addToPrescriptions(objPresEight)
	objDocTwo.addToPrescriptions(objPresTwo)
	objDocTwo.addToPrescriptions(objPresThree)
	objDocThree.addToPrescriptions(objPresFive)
	objDocThree.addToPrescriptions(objPresSix)
	objDocFour.addToPrescriptions(objPresSeven)
	objDocFour.addToPrescriptions(objPresFour)
	objDocFour.addToPrescriptions(objPresEight)
	objDocFour.addToPrescriptions(objPresTwo)
	

	}

	def destroy = {

	}
}
