import { createContext, useState } from 'react';

export const Theme = createContext();

export const ContextProvider = ({ children }) => {
    const [value, setValue] = useState("Rohit");

    return <Theme.Provider value={{ value, setValue }}>
        {children}
    </Theme.Provider>
};