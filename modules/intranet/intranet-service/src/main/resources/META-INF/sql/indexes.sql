create index IX_1D85CC0B on Vacaciones_Vacaciones (groupId, status);
create index IX_CB982F5F on Vacaciones_Vacaciones (userId);
create index IX_4EC7544F on Vacaciones_Vacaciones (userName[$COLUMN_LENGTH:75$]);
create index IX_31026ED9 on Vacaciones_Vacaciones (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_75DAD79B on Vacaciones_Vacaciones (uuid_[$COLUMN_LENGTH:75$], groupId);