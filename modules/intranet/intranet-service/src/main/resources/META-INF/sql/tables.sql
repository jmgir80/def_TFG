create table Vacaciones_Vacaciones (
	uuid_ VARCHAR(75) null,
	vacId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	desde DATE null,
	hasta DATE null,
	comentarios VARCHAR(75) null,
	calendarBookingId LONG,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);