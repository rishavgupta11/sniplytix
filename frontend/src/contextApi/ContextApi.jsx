import { createContext, useContext, useState } from "react";

const StoreContext = createContext();

export const ContextProvider = ({ children }) => {
  const [token, setToken] = useState(
    localStorage.getItem("JWT_TOKEN") || null
  );

  return (
    <StoreContext.Provider value={{ token, setToken }}>
      {children}
    </StoreContext.Provider>
  );
};

export const useStoreContext = () => useContext(StoreContext);
