package Programowanie1.tydzien4.sobota.enumy;

public enum Size
{
    XXL(1) {
        @Override
        public boolean isLarge()
        {
            return true;
        }
    },

    XL(2) {
        @Override
        public boolean isLarge()
        {
            return true;
        }
    },

    L(3) {
        @Override
        public boolean isLarge()
        {
            return true;
        }
    },

    M(4) {
        @Override
        public boolean isLarge()
        {
            return false;
        }
    },
    S(5) {
        @Override
        public boolean isLarge()
        {
            return false;
        }
    };

    private int size;

    public boolean isLarge()
    {
        return false;
    }

    public boolean isSmall()
    {
        return false;
    }

    Size (int size)
    {
        this.size = size;
    }
}
