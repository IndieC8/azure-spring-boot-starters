/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.msgraph.api;

public interface MailOperations {
    Messages listMessages(String mailFolder);

    void sendMail(Message message, Boolean saveToSentItems);
}
