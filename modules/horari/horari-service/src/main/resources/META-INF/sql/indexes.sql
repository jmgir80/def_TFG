create index IX_1E45ACAF on Horari_Horari (userName[$COLUMN_LENGTH:75$]);
create index IX_C2526739 on Horari_Horari (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_298D67FB on Horari_Horari (uuid_[$COLUMN_LENGTH:75$], groupId);